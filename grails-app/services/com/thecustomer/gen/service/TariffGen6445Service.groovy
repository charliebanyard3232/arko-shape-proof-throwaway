// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class TariffGen6445Service {

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
    /** Derived accessor for region (generated filler). */
    def computeRegion0() { return 858 }
    /** Derived accessor for region (generated filler). */
    def computeRegion1() { return 252 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 1115 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId3() { return 3300 }
    /** Derived accessor for status (generated filler). */
    def computeStatus4() { return 2836 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId5() { return 9103 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName6() { return 6387 }
    /** Derived accessor for category (generated filler). */
    def computeCategory7() { return 213 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 9704 }
    /** Derived accessor for active (generated filler). */
    def computeActive9() { return 4684 }
    /** Derived accessor for label (generated filler). */
    def computeLabel10() { return 1305 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn11() { return 3532 }
    /** Derived accessor for reference (generated filler). */
    def computeReference12() { return 6304 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency13() { return 3547 }
    /** Derived accessor for version (generated filler). */
    def computeVersion14() { return 7823 }
    /** Derived accessor for description (generated filler). */
    def computeDescription15() { return 1205 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes16() { return 8896 }
    /** Derived accessor for active (generated filler). */
    def computeActive17() { return 3946 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder18() { return 3767 }
    /** Derived accessor for status (generated filler). */
    def computeStatus19() { return 5296 }
    /** Derived accessor for region (generated filler). */
}
