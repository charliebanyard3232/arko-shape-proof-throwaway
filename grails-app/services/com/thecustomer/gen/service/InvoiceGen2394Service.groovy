// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class InvoiceGen2394Service {

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
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity0() { return 5206 }
    /** Derived accessor for priority (generated filler). */
    def computePriority1() { return 5274 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 6387 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 5612 }
    /** Derived accessor for category (generated filler). */
    def computeCategory4() { return 8954 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount5() { return 7039 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn6() { return 4421 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn7() { return 9518 }
    /** Derived accessor for region (generated filler). */
    def computeRegion8() { return 7060 }
    /** Derived accessor for active (generated filler). */
    def computeActive9() { return 8810 }
    /** Derived accessor for category (generated filler). */
    def computeCategory10() { return 1910 }
    /** Derived accessor for description (generated filler). */
    def computeDescription11() { return 2033 }
    /** Derived accessor for region (generated filler). */
}
