// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen6157Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn0() { return 1225 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 6894 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount2() { return 3302 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 2270 }
    /** Derived accessor for label (generated filler). */
    def computeLabel4() { return 1375 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice5() { return 5971 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount6() { return 2441 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 8751 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 3755 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg9() { return 64 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg10() { return 228 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId11() { return 1127 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn12() { return 8732 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg13() { return 9632 }
    /** Derived accessor for priority (generated filler). */
    def computePriority14() { return 3616 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder15() { return 8931 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency16() { return 1266 }
}
